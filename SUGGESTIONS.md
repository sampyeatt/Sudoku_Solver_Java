# Suggestions

## IntelliJ Setup
Perhaps it's just an issue when I cloned this. But at least in my setup
the IDE doesn't recognize what exactly the directories contain.

You want your code to look professional. Most languages have unofficial
style guides that explain everything about how your code should be laid
out.

Making lots of small methods that don't do much, but what they do, they
do well is better than making a few really big methods that do tons of
things. It's hard to give a concrete answer of what's too big. Sometimes
a method that's 100 lines long makes sense. Other times it's way too big.
One way to tell if a method is getting too be is if you have to pass
a whole bunch of variables into it.

Naming variables, functions and methods properly helps make the code
self-documenting.

I made a suggestion to give many of the variables and methods different
names. IntelliJ has a really simple mechanism to make changes in one
place and have them take effect globally.
1. Highlight the method you want to change.
1. Right-click and select 'Refactor'
1. Select 'Rename'. You will be given a prompt to change
the name to something new. When completed it will make the
changes in all your files.

## Naming conventions
Every language has naming conventions. These aren't hard-and-fast
rules. But you really don't want to deviate from them. Professionals
with think you are a hack if you do.

Here are the 4 basic naming conventions. Some of languages use a mixture depending
on what it is. Some styles may not even be possible in some languages.

1. camelCase - first word is lower case, subsequent words are capitalized.
Examples:
```
wordCounter
matchFound
upperLeftNode
```
2. snake_case - all lower case characters with underscore `_` between words.
Examples:
```
word_counter
match_found
upper_left_node
```
3. kebab-case - all lower case characters with hyphen `-` between words.
Examples:
```
word-counter
match-found
upper-left-node
```
4. PascalCase - Every word is capitalized.
Examples:
```
WordCounter
MatchFound
UpperLeftNode
```

### Java
[Java Naming Conventions](https://github.com/twitter/commons/blob/master/src/java/com/twitter/common/styleguide.md) have three
components
1. instance variables, local variables and method names use camelCase. (ex. wordCounter)
2. Class names use PascalCase. (ex. BufferedReader)
3. Static variables use an all caps variant of snake case. (ex. WORDS_PER_LINE)
4. Package names and paths are almost always all lower case.

### Python
I'm not a python expert but this is what I've seen.
1. instance variables, methods and functions are snake_case. (ex. word_counter, move_right())
2. Classes are PascalCase

### C
You probably won't use C a lot in the professional world. But [C exclusively](https://www.gnu.org/prep/standards/html_node/Writing-C.html) uses snake_case.


