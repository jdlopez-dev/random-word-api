[spring tutorial rest](https://spring.io/guides/tutorials/rest/)

[heroku java-support](https://devcenter.heroku.com/articles/java-support)

[github actions deploy spring boot to heroku](https://medium.com/@reachansari/automatic-deployment-to-heroku-ci-cd-spring-boot-maven-github-actions-2c63f7fd79d1)

***

Steps to set the $JAVA_HOME environment variable on macOS.

> Find out your macOS version.

> Find out which shell you are using, bash or zsh?

* echo $SHELL

* For zsh shell, export $JAVA_HOME at ~/.zshenv or ~/.zshrc.

* For bash shell, export $JAVA_HOME at ~/.bash_profile or ~/.bashrc.

> Test with echo $JAVA_HOME. Done.

> On Mac OS X 10.5 or later, we can use /usr/libexec/java_home to return the location of the default JDK.

* /usr/libexec/java_home

> find all installed JDKs.

* /usr/libexec/java_home -V

> $JAVA_HOME and macOS 11 Big Sur

* export JAVA_HOME=$(/usr/libexec/java_home) > ~/.zshrc
* source ~/.zshenv

