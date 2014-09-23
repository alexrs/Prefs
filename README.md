Prefs
=====
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Prefs-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/978)


Wrapper for Android Preferences which provides a fluid syntax.

## Usage
This library is really easy to use.

#### Save data

```JAVA
Prefs.with(context).save(key, value);
```

You can save:

* String
* int
* float
* long
* boolean
* Set\<String>

#### Get data saved
```JAVA
// String
Prefs.with(context).getString(key, defValue);
// boolean
Prefs.with(context).getBoolean(key, defValue);
// int
Prefs.with(context).getInt(key, defValue);
// float
Prefs.with(context).getFloat(key, defValue);
//long
Prefs.with(context).getLong(key, defValue);
// Set<String>
Prefs.with(context).getStringSet(key, defValue);
//All
Prefs.with(context).getAll();
```
#### Remove data

```JAVA
Prefs.with(context).remove(key);
```


License
-------
    Copyright 2014 Alexrs95.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
