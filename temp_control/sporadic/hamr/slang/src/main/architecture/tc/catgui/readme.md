# Kucing Melihat

Note that the initial version of this readme was done against commit https://github.com/santoslab/hamr-examples/tree/78851b7f82719ee5aba0551c38f818c8de142d67

## Static Model Info / Message Protocol

- The component [data struct](compSC.scala) only has ins, outs and a name.  It would be nice to have 'flexible' children.  Maybe a component's children just specify their kind and Kucing uses that to create the children types -- e.g. codegen tags component chilren as 'In Ports', 'Out Ports', 'State Variables'.

    Related to that, it felt weird to place state vars in either Inputs or Outputs -- I wanted to have the categories be Pre State and Post State.  I opted for placing them in just Outputs as also displaying them in Inputs didn't give me much useful info when viewing dynamic updates.  However, having them in both Pre and Post views would probably be useful when stepping through via the static scheduler.

- Likewise it might be nice if codegen can also specify the columns for children as part of the static ModelInfo to Kucing [phase](../runtimemonitor/GUI.scala#L23-L49).  

- It would be nice to be able to display meta info.  e.g. component rows have an 'i' icon which when clicked displays information like dispatch protocol, connections, etc.  Its port child's meta info could include port kind (event, event data, data), direction, payload type if applicable, what its connected to, etc.  Meta info could be passed, for eg., as an ISZ[String] or an HTML blob that could be displayed via a JLabel. 

- It seemed odd that codegen had to pass [inputs](../runtimemonitor/GUI.scala#L170)/[outputs](../runtimemonitor/GUI.scala#L180) when doing an updatePort (btw, that probably should be something more generic e.g. updateValue).  Maybe that's to allow rows to be inserted/deleted?

    Instead I imagined it would be something like an access path e.g. bridgeId"1" -> portId"27", though portId's are unique and codegen could compute unique ids for pre/post state vars so maybe it just sends an 'id' that Kucing can use to lookup and find the corresponding row to update.

- To know what should be updated for a row, maybe accept an ISZ[Option[Value]] where Value is a data struct hierarchy that Kucing knows how to display -- e.g. StringValue, IntValue, ArrayValue, RecordValue, etc.  Each index in the sequence reflects a column in the table.  None indicates no update for the corresponding row, Some means an update is requested -- and that could be used to color the cell as opposed to the current string comparison.

    The data types used in the message protocol should probably be Slang types so that we can serialize/deserialize them to JSON.  I'm guessing these datatypes along with the JSON utils will be published and added as an IVY dep in the codegen generated project.cmd


## Update notifications

- Nothing changed when update requests were sent so I held onto the tree model so that [fireTableDataChanged](JTreeTableSC.scala#L64) could be called on updates.  We don't want that as it redraws the whole table (e.g. double clicking to expand may fail if an update occurs after the first click). Instead something like a 'fireTableRowsUpdated' should be called by the model when an update request is made.  Better still, fireTableCellUpdated

- the cell that updated should be colored rather than the ports name, or the whole row should be colored

- by default the update request should trigger an update notification rather than the view comparing cell contents.   

- future updates can/will happen on the same row so there should be an indication that a 'fresh' update occurred

    - color could slowly fade -- e.g could have an option to fade to white after a user defined interval
    - could cycle through colors 
    - rather (or in addition to) using color, perhaps make the font bold and bigger and then shrink back down after some time interval

## General UI

- add an option where clicking on a row expand/collapses all its children

- it would be nice to be able to hide/unhide rows



