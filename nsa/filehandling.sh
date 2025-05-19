echo "Enter file content press ctrl+d to stop"
cat > profile.txt
 # copying the file
cp profile.txt profilecp.txt
echo "File Copied"
read -p "Enter the line from which file has to be printed:" line
tail -n $line profile.txt

#storing difference between 2 file
read -p "Enter file1 name:" file1
read -p "Enter file2 name:" file2
if [ -f $file1 ] && [ -f $file2 ]
then
	diff $file1 $file2 > diff.txt
	echo "Differnce between the files"
	cat diff.txt
else
	echo "Inavlid input"
fi

#printing lines matching pattern
read -p "Enter file1 name:" file
read -p "Enter pattern:" pattern
echo "Matching lines"
grep -i $pattern $file 

