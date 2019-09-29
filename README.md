# a1-positional-style-converter

[![CircleCI](https://img.shields.io/circleci/build/github/medeiros/a1-positional-style-converter/master)](https://circleci.com/gh/medeiros/a1-positional-style-converter)
[![Code Size](https://img.shields.io/github/languages/code-size/medeiros/a1-positional-style-converter)](https://img.shields.io/github/languages/code-size/medeiros/a1-positional-style-converter)
[![License](https://img.shields.io/github/license/medeiros/a1-positional-style-converter)](https://img.shields.io/github/license/medeiros/a1-positional-style-converter)

This application convert data between C1 style (Excel references for
columns) and positional (starting at zero) style.

For instance:

- A is equivalent to position 0
- K is equivalent to position 10

## Installation

$ lein -uberjar

## Usage

$ java -jar a1-positional-style-converter-0.1.0-standalone.jar [args]

- arg0: <c1 value | positional value>
- arg1: <to-pos|to-ci>

## Examples

$ java -jar a1-positional-style-converter-0.1.0-standalone.jar C to-pos
returns 2

$ java -jar a1-positional-style-converter-0.1.0-standalone.jar 10 to-c1
returns K

### Improvements

## License

Copyright © 2019 medeiros

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
