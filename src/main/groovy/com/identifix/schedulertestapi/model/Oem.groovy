package com.identifix.schedulertestapi.model

import groovy.transform.Canonical
import groovy.transform.ToString

@Canonical
@ToString(includeNames = true, includePackage = false)
class Oem {
    String oem
    String path
    String bucketName
    String exchangeName
}
