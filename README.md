MS_PS
=====

This program is the implementation of MSPS algorithm in Data Mining, Sequential pattern mining using multiple minimum supports with a support difference constraint. It is written in Java. 

### Input File Format

Default input path: ./example/

data.txt

<{1, 2, 3}{4}> -- This is a transaction / sequence

{1, 2, 5} -- represents an itemset and each number represents an individual item

para.txt

MIS(2) = 0.002 -- Minimum item support for item 2

SDC = 0.05 -- Support difference constraint value.

### Output File Format

Default output path: ./output/

The number of length 1 sequential patterns is 20
Pattern: <{2}> Count: 4

......

The number of length 2 sequential patterns is 7
Pattern: <{2}{5}> Count: 1

......

The number of length 3 sequential patterns is 5
Pattern: <{2}{5}{7}> Count 1

......
