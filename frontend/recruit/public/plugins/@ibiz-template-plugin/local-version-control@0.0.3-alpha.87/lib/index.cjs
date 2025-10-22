'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

var index$1 = require('./components/index.cjs');
var index$2 = require('./de-actions/index.cjs');
var index$3 = require('./panel-items/index.cjs');

"use strict";
var index = {
  install(_app) {
    _app.use(index$1.default);
    _app.use(index$2.default);
    _app.use(index$3.default);
  }
};

exports.default = index;
