# Isolette

## Tool Setup

Install Kekinian, HAMR, FMIDE, and IVE by following the instructions at [Installing and Updating FMIDE (customization of AADL OSATE IDE) and HAMR](https://hamr.sireum.org/hamr-doc/ch0X-hamr-installation.html#installing-and-updating-fmide-customization-of-aadl-osate-ide-and-hamr) 

That will install FMIDE

## Running Demo

## Running Proyek Logika

From the command line:

```
sireum proyek logika --par --all hamr/slang
```

or, invoke the script [hamr/slang/bin/run-logika.cmd](hamr/slang/bin/run-logika.cmd)

```
hamr/slang/bin/run-logika.cmd
```

From IVE, if the file is in Logika (ie. header contains ``// #Sireum #Logika``) then you can right click the editor and in the context menu choose ``Logika Check (All in File)`` or ``Logika Check (Line)``.