# Identifying the source file to define your environment variables

The source file is the configuration file which will be used to recognize our custom environment variables for all the tools and command lines to be used for development/automation process.

1. Open a new terminal and execute the command ```echo $SHELL``` it will show us the extension to recognize our source path.
   E.g:
   ```
   seorozcope@Sebastians-MacBook-Pro Home % echo $SHELL
   /bin/zsh
   ```
2. You can find the following responses:
   
   1. ```/bin/zsh``` which means that your source path is ```~/.zshrc```
   
   2. ```/bin/bash``` which means that your source path is ```~/.bashrc``` or ```~/.bash_profile```

3. At the terminal you can open the source folder using ```open {PATH}```
   e.g. ```open ~/.zshrc```

**Note:** If the folder does not exist, you can alternatively create it using ```touch {PATH}``` e.g. ```touch ~/.zshrc```, then you’ll be able to open/edit it.