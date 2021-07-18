[中文](./OutlineEditText.md) | **English**

# Demo

This is a edit text component contains outline title and bottom tip, which can set the background and color of each part by yourself.

<img src=".\assets\outlineedittextdemo.gif" style="zoom:33%;" />

# Usage

```xml
<com.yuyi.uikit.outlineedittext.OutlineEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/oet_input"
        android:layout_marginHorizontal="@dimen/dp10"
        app:title="Title"
        app:hint="Hint"
        app:tip="Tip"
        app:inputBackground="@null"
        android:layout_marginTop="@dimen/dp80"
        android:layout_marginBottom="@dimen/dp8"/>
```

# Attributes

| Attributes        | Description                | Type             | Default Value | Enum                                    |
| ----------------- | -------------------------- | ---------------- | ------------- | --------------------------------------- |
| title             | outline title              | string           | title         | -                                       |
| titleVisibility   | outline title visibility   | enum             | View.VISIBLE  | View.VISIBLE, View.GONE, View.INBISIBLE |
| titleTextColor    | outline title text color   | color            | #999999       | -                                       |
| titleBackground   | outline title background   | reference，color | #FFFFFFFF     | -                                       |
| hint              | input box placeholder text | string           | placeholder   | -                                       |
| tip               | bottom tip text            | string           | -             | -                                       |
| tipVisibility     | bottom tip visibility      | enum             | View.GONE     | View.VISIBLE, View.GONE, View.INBISIBLE |
| tipTextColor      | bottom tip text color      | color            | #888888       | -                                       |
| inputBackground   | input box background       | reference，color | -             | -                                       |
| android:inputType | input type                 | enum             | -             | -                                       |

# API

| Method             | Description                                                  | Return Type | Parameter Type | Enum                                    |
| ------------------ | ------------------------------------------------------------ | ----------- | -------------- | --------------------------------------- |
| setTitleBackground | Set outline title background                                 | void        | Drawable       | View.VISIBLE, View.GONE, View.INBISIBLE |
| setInputBackground | Set outline title background, if parameter is null, set the background as the default value or the value declared in layout. | void        | Drawable       | -                                       |
| setInputBackground | Set the background as the default value or the value declared in layout. | void        | -              | -                                       |
| setTitleVisibility | Set outline title visibility                                 | void        | int            | -                                       |
| setInputType       | Set input type                                               | void        | int            | -                                       |
| setTipVisibility   | Set bottom tip visibility                                    | void        | int            | View.VISIBLE, View.GONE, View.INBISIBLE |
| setTip             | Set bottom tip text, if parameter is not null and empty string, the visibility of it will be set to visible. | void        | String         | -                                       |
| setTipColor        | Set bottom tip text color.                                   | void        | int            | -                                       |
| setTipColor        | Set bottom tip text color as the default color or the color declared in layout. | void        | -              | -                                       |
| setTitleColor      | Set outline title text color.                                | void        | int            | -                                       |
| setTitleColor      | Set outline title text color as the default color or the color declared in layout. | void        | -              | -                                       |
| setTitle           | Set outline title text.                                      | void        | String         | -                                       |
| setHint            | Set input box placeholder text.                              | void        | String         | -                                       |
| getText            | Get the text which user input.                               | String      | -              | -                                       |
| setHintColor       | Set input box placeholder text color.                        | void        | int            | -                                       |

