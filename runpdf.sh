#!/bin/sh
#PAGES=3 # set to the number of pages in the PDF
SOURCE=$1
#SOURCE=pamphlet-low.pdf # set to the file name of the PDF
OUTPUT=result # set to the final output file
RESOLUTION=300 # set to the resolution the scanner used (the higher, the better)


PAGES=xpdf-pdfinfo $1 | grep Pages: | awk '{print $2}' | tail -n 1

#touch $OUTPUT
for i in `seq 1 $PAGES`; do
    convert -density $RESOLUTION -depth 8 $SOURCE\[$(($i - 1 ))\] page$i.png
#    tesseract page$i.tif >> $OUTPUT
    tesseract page$i.png $OUTPUT$i
done
 cat *.txt >> mergeall.txt
