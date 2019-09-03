# Panda Control

I had to use NGrok on some projects and found myself in the impasse of having to start it via CMD, so it came to my mind to create a control panel where I could handle the server simply, that's how PandaControl was born.

The system was created entirely in Java.
JDK 1.8, Netbeans IDE

![image](https://user-images.githubusercontent.com/40338524/64138674-62736000-cdd4-11e9-97c7-90623b2cfe3d.png)
![image](https://user-images.githubusercontent.com/40338524/64138646-2e983a80-cdd4-11e9-87b4-838a1b0dc322.png)

_Currently the system has two themes, Light and Dark. If you want to add (or have any ideas), do a PullRequest or contact me!_

## Installation

For now I ran PandaControl only on Windows 32 and 64 bit. If you want to test it on another OS feel free.

You must declare an environment variable to use the software:

Windows:

```
Move 'pandacontrol' to your UserProfile and
setx %USERPROFILE%\pandacontrol\bin
```

## Usage example

_Coming soon_

## Development setup

_Coming soon_

## Release History

* 0.2.1
    * ADD: Themes (Dark and Light)
    * ADD: Floating Notification
    * ADD: Change NGrok AUTHTOKEN in PandaControl
    * CHANGE: Update docs (module code remains unchanged)
* 0.2.0
    * CHANGE: Automatically detect arch
    * ADD: Add `trayIconPanda()`
    * ADD: Add `SplashScreen`
* 0.1.1
    * FIX: Multiple Dashboard Instances
* 0.1.0
    * ADD: Settings Windows
    
    ![image](https://user-images.githubusercontent.com/40338524/64139383-0d851900-cdd7-11e9-994e-42041720bb06.png)
    * CHANGE: Rename `PandaServer` to `PandaControl`
* 0.0.1
    * Work in progress

## Meta

Abner Rodrigues – [@KingAspx](https://github.com/kingaspx) – KingAspx

## Contributing

1. Fork it (<https://github.com/yourname/yourproject/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img dfn's -->
[npm-image]: https://img.shields.io/npm/v/datadog-metrics.svg?style=flat-square
[npm-url]: https://npmjs.org/package/datadog-metrics
[npm-downloads]: https://img.shields.io/npm/dm/datadog-metrics.svg?style=flat-square
[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://travis-ci.org/dbader/node-datadog-metrics
[wiki]: https://github.com/yourname/yourproject/wiki
