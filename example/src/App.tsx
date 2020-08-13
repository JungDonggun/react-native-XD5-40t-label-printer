import * as React from 'react';
import { StyleSheet, View } from 'react-native';
import Xd5405LabelPrinter from 'react-native-xd5-405-label-printer';

export default function App() {
  React.useEffect(() => {
    console.log('@@@@@@@@@@@', Xd5405LabelPrinter);
  }, []);

  return <View style={styles.container} />;
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
