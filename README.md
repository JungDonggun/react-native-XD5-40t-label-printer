
# react-native-react-native-xd5-40t-printer

## Getting started

`$ npm install react-native-react-native-xd5-40t-printer --save`

### Mostly automatic installation

`$ react-native link react-native-react-native-xd5-40t-printer`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-react-native-xd5-40t-printer` and add `RNReactNativeXd5_40tPrinter.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeXd5_40tPrinter.a` to your project's `Build Phases` ➜ `Link Binary With Libraries` 4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeXd5_40tPrinterPackage;` to the imports at the top of the file
  - Add `new RNReactNativeXd5_40tPrinterPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-xd5-40t-printer'
  	project(':react-native-react-native-xd5-40t-printer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-xd5-40t-printer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-xd5-40t-printer')
  	```

## Usage
```javascript
import RNReactNativeXd5_40tPrinter from 'react-native-react-native-xd5-40t-printer';

// TODO: What to do with the module?
RNReactNativeXd5_40tPrinter;
```
  
