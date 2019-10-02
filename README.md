# a1-positional-style-converter

[![CircleCI](https://img.shields.io/circleci/build/github/medeiros/a1-positional-style-converter/master)](https://circleci.com/gh/medeiros/a1-positional-style-converter)
[![Code Size](https://img.shields.io/github/languages/code-size/medeiros/a1-positional-style-converter)](https://img.shields.io/github/languages/code-size/medeiros/a1-positional-style-converter)
[![License](https://img.shields.io/github/license/medeiros/a1-positional-style-converter)](https://img.shields.io/github/license/medeiros/a1-positional-style-converter)

This application convert data between C1 style (Excel references for
columns) and positional (starting at zero) style.

For instance:

|A1 ref|Is equivalent to position|
|---|---|
|A|0|
|K|10|
|AA|26|
|AZ|51|

The other direction is also covered:

|Position|Is equivalent to A1 ref|
|---|---|
|25|Z|
|9|J|
|703|AAB|
|27|AB|

Useful when working between Excel/CSV and Java positional referencing.

## Installation

    $ lein -uberjar

## Usage

    $ java -jar a1-positional-style-converter-0.1.0-standalone.jar [args]

- arg0: <pos|a1>
- arg1: <pos value|a1 value>

## Examples

    $ java -jar a1-positional-style-converter-0.1.0-standalone.jar a1 C

returns 2

    $ java -jar a1-positional-style-converter-0.1.0-standalone.jar pos 10

returns K

## License

Copyright © 2019 medeiros

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
