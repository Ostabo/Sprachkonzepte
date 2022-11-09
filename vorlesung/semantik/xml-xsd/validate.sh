#!/bin/sh
x="xmllint $2"
echo \# $x
eval $x

x="xmllint --schema $1 $2"
echo \# $x
eval $x
