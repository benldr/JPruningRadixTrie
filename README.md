JPruningRadixTrie<br> 
[![MIT License](https://img.shields.io/github/license/wolfgarbe/pruningradixtrie.png)](https://github.com/wolfgarbe/PruningRadixTrie/blob/master/LICENSE)
========
Java port of [wolfgarbe/PruningRadixTrie](https://github.com/wolfgarbe/PruningRadixTrie). See link for the background of the project etc. All credit to Wolf Garbe.  
  
  
No features have been added/removed other than where necessary to match Java conventions. So functionality and performance should be unchanged, aside only from these exceptions:  
- Removed parameter `out long termFrequencyCountPrefix` from method `getTopkTermsForPrefix` because awkward to achieve this in Java without changing the method's return type significantly. Specifically, the functionality lost is- getting the number of terms in the dictionary which begin with the given prefix (not an essential feature). 
- Introduced parameter `String delimiter` to method `readTermsFromFile` so that text files with delimiters other than *\t* can be read. See Usage below. 

***

### Download Instructions:
Copy the source code into your project! There are only 4 classes to copy, and no external dependencies. I'm afraid I do not have plans to upload this project to Maven Central or the like. 

***

### Usage: 

**Create Object**
``` 
PruningRadixTrie pruningRadixTrie = new PruningRadixTrie();
``` 
**addTerm:** insert term and term frequency count into Pruning Radix Trie. Frequency counts for same term are summed up.
```
pruningRadixTrie.addTerm("microsoft", 1000);
```
**getTopkTermsForPrefix:** retrieve the top-k most relevant terms for a given prefix from the Pruning Radix Trie.
``` 
String prefix = "micro";
int topK = 10;
List<TermAndFrequency> results = pruningRadixTrie.getTopkTermsForPrefix(prefix, topK);
for (TermAndFrequency result : results) {
  System.out.println(result.getTerm() + " " + result.getTermFrequencyCount());
}
``` 
**readTermsFromFile:** Deserialise the Pruning Radix Trie from disk for persistence. Note here that *terms.txt* contains tab-delimited lines, ie in the format *term\tfrequency*. If format is *term,frequency* then replace second argument with *","*, etc.
``` 
pruningRadixTrie.readTermsFromFile("terms.txt", "\t");
```
**writeTermsToFile:** Serialise the Pruning Radix Trie to disk for persistence.
``` 
pruningRadixTrie.writeTermsToFile("terms.txt");
```


