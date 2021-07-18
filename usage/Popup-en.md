[中文](./Popup.md) | **English**

# Demo

This is a top popup window, including 4 basic types: *success*, *info*, *error*, *warning*. It also support customize the color, duration, click event and close event.

![](C:/Users/NTUCLHUB/Desktop/AndroidStudy/workspace/UIKit/usage/assets/popuptopdemo.gif)

# Usage

```java
Popup.top(this, "Success").success();
Popup.top(this, "Error").error();
Popup.top(this, "Warning").warning();
Popup.top(this, "Info").info();
//Customize color
Popup.top(this, "Customize Color").show(getColor(R.color.gray));
//set duration
Popup.top(this, "duration is 40000 millis")
                .duration(4000)
                .success();
//set click event
Popup.top(this,"set on click event")
                .onClick(()-> Toast.makeText(this,"onclick event",Toast.LENGTH_SHORT).show())
                .success();
//set close event
Popup.top(this,"set on close event")
                .onClose(()->Toast.makeText(this,"onclose event",Toast.LENGTH_SHORT).show())
                .info();
```

