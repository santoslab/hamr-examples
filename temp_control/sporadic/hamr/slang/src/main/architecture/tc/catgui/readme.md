# Kucing Melihat

## Message Protocol

- The component [data struct](compSC.scala) only has ins, outs and a name.  It would be nice if codegen could specify how things should be laid out.  e.g. I want top level rows to give me the component name and perhaps an 'i' icon which when clicked displays infomration like its dispathc protocol, connections, etc.  Its children perhaps are 'In Ports', 'Out Ports', and 'State Variables'.  The children under those categories should also have some way of specifying additiaonl meta info -- ie.. more than just Description.  E.g. a port's 'i' icon could indicate its kind (event, event data, data), direction, its payload type if applicable, the last time it received an update, who its connected to, etc.

- Nothing changed when update requestes were sent so I held onto the tree model so that [fireTableDataChanged](JTreeTableSC.scala#L64) could be called on updates.  We don't want that as it redraws the whole table (e.g. double clicking to expand may fail if an update occurs after the first click). Instead something like a 'fireTableRowsUpdated' should be called by the model when an update request is made.

## Update notifications

- 

- the cell that updated should be colored rather than the ports name, or the whole row should be colored

- by default the update request should trigger an update notification rather than the view comparing cell contents.   

- future updates can/will happen on the same row so there should be an indication that a 'fresh' update occurred

    - color could slowly fade -- e.g could have an option to fade to white after a user defined interval
    - could cycle through colors 
    - rather (or in addition to) using color, perhaps make the font bold and bigger and then shrink back down after some time interval

## General UI

- add an option where clicking on a row expand/collapses all its children


