var exec = require('cordova/exec');

function PuS() {}

PuS.prototype.setSessionID = function (sessionID, callbackContext) {
    sessionID = sessionID || '';
    callbackContext = callbackContext || {};
    exec(
        callbackContext.success || null,
        callbackContext.error || null,
        'PuS',
        'setSessionID',
        [sessionID]
    );
};

module.exports = new PuS();