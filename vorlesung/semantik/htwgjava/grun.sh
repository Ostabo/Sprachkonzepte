#!/bin/sh
java -cp '../antlr-4.9.2-complete.jar;.' org.antlr.v4.gui.TestRig HtwgJava compilationUnit -gui < $1
