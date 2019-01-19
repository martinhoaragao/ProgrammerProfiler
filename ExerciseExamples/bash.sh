for x in ./*.java; do
  mkdir "${x%.*}" && mv "$x" "${x%.*}"
done
