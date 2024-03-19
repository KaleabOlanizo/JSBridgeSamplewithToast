# Super App SDK: Sample JavaScript Bridge Implementation

Welcome to the Super App SDK sample repository! This repository contains a sample implementation of a JavaScript bridge for communication between web content and native Android code, specifically demonstrating how to display a toast message from JavaScript in an Android WebView.

## Overview

A JavaScript bridge serves as a communication mechanism between JavaScript running in a WebView and native Android code. In this sample implementation, we demonstrate how to create a JavaScript bridge that allows the execution of native Android code to display a toast message.

## Sample Implementation

### JavaScript Bridge Interface

The `MyJavaScriptInterface` interface defines the method `showToast(message: String)` which will be called from JavaScript to display a toast message.

### JavaScript Bridge Implementation

The `MyJavaScriptInterfaceImpl` class implements the `MyJavaScriptInterface` interface and provides the implementation for displaying the toast message using Android's `Toast` class.

### WebView Setup

The WebView in the Android app is configured to enable JavaScript and to add an instance of `MyJavaScriptInterfaceImpl` as a JavaScript interface, making it accessible from JavaScript code within the WebView.

### HTML & JavaScript Code

The `index.html` file contains sample HTML and JavaScript code demonstrating how to call the `showToast()` method exposed by the JavaScript interface.

## Usage

To use this sample implementation:

1. Clone this repository to your local machine.
2. Open the Android project in Android Studio.
3. Run the app on an emulator or a physical device.
4. Once the app is running, click the "Show Toast" button in the WebView to display a sample toast message.

## Resources

- [Android WebView Documentation](https://developer.android.com/reference/android/webkit/WebView)
- [Building a JavaScript Bridge for WebView Communication in Kotlin Android Apps](<https://kaleabolani.medium.com/the-bedrock-of-a-super-app-sdk-js-bridges-b79d2f49b428>)

## License

This sample implementation is provided under the [MIT License](LICENSE).

Feel free to explore, experiment, and integrate this sample JavaScript bridge into your own Super App projects!

For any questions or feedback, please don't hesitate to reach out.

Happy coding! 🚀
