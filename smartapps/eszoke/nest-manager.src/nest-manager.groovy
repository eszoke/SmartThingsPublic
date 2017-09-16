/**
 *  Nest Manager
 *
 *  Copyright 2017 Anthony S
 *
 */
definition(
    name: "Nest Manager",
    namespace: "eszoke",
    author: "Anthony S",
    description: "NST Manager allows you to integrate your Nest products with the SmartThings platform. It can be used to trigger or respond to various device events by using standard SmartThings capabilities. This allows for a high level customization of automations.",
    category: "Convenience",
    iconUrl: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience.png",
    iconX2Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png",
    iconX3Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png") {
    appSetting "clientId"
    appSetting "clientSecret"
}


preferences {
	section("Title") {
		// TODO: put inputs here
	}
}

def installed() {
	log.debug "Installed with settings: ${settings}"

	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe()
	initialize()
}

def initialize() {
	// TODO: subscribe to attributes, devices, locations, etc.
}

// TODO: implement event handlers