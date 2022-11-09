#!/bin/sh
t="java -cp Java.jar org.antlr.v4.gui.TestRig Java compilationUnit -tokens < $1 > ${1}.tokens"
echo $t
eval $t
gui="java -cp Java.jar org.antlr.v4.gui.TestRig Java compilationUnit -gui < $1"
echo $gui
eval $gui
