# Small-Api-Project

## Overview 
This project uses DeepSeek API to convert numbers into words in Java.

---

## Setup & Usage

1. **API Key Setup**

    - Open the `src/ApiKeyManager.java` file.
    - Go to deepseek platform and generate a key, then inside it inside the global variable for API Key.
    - **Important:** Before pushing code to git, **remove the `#` in `.gitignore`** for `ApiKeyManager.java` and `ApiKeyManager.class` for security reason.

---

2. **Compile and run the project**

   From the project root directory, run:

   ```bash
   javac -cp lib/gson-2.11.0.jar -d bin src/*.java

   ```bash
   java -cp "bin;lib/gson-2.11.0.jar" ConvertNumberToWords

## Credits

This project uses the [JDeepSeek API](https://github.com/Assetvi/JDeepSeek) by Assetvi, licensed under the [MIT License](https://github.com/Assetvi/JDeepSeek/blob/main/LICENSE).
