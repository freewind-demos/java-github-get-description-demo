Java Github Get Repo Description Demo
=====================================

Use [org.eclipse.egit.github.core](https://github.com/eclipse/egit-github/tree/master/org.eclipse.egit.github.core) to get the description of a repository from github.

You need to create an access token in your github account, and create a `github-token.txt` in the root of your project, with the content of the token.

Run `Hello.java` in your IDE.

Attention
---------

1. Make sure you never include your `github-token.txt` file in git or share to others
2. Some of the github-api urls are blocked or unstable in some countries. If you can't get response in reasonable time, try run the code through proxies.

Resources
---------

- All github libraries: <https://developer.github.com/v3/libraries/>