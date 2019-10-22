# Try Out Visual Studio Code Development Containers: Kotlin

Ideas are based on the official **[VS Code Remote Try Java Project](https://github.com/microsoft/vscode-remote-try-java)**

The docker image is based on the ideas from VS Codes java project, but I wanted to try gradle instead. Also it uses JDK12. 

SDKman is used to install kotlin in the container, inspiration for this is from the **[docker-sdkman](https://github.com/donbeave/docker-sdkman)** project.

This is a sample project that lets you try out the **[VS Code Remote - Containers](https://aka.ms/vscode-remote/containers)** extension in a few easy steps.

## Setting up the development container

Follow these steps to open this sample in a container:

1. If this is your first time using a development container, please follow the [getting started steps](https://aka.ms/vscode-remote/containers/getting-started).

2. **Linux users:** You can update `USER_UID` and `USER_GID` in `.devcontainer/Dockerfile` with your user UID/GID to avoid creating files as root.

3. If you're not yet in a development container:
   - Clone this repository.
   - Press <kbd>F1</kbd> and select the **Remote-Containers: Open Folder in Container...** command.
   - Select the cloned copy of this folder, wait for the container to start, and try things out!