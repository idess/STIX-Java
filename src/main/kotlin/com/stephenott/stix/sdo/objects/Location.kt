package com.stephenott.stix.sdo.objects

import com.stephenott.stix.sdo.StixDomainObject
import com.stephenott.stix.type.*
import com.stephenott.stix.type.vocab.AdministrativeArea
import com.stephenott.stix.type.vocab.City
import com.stephenott.stix.type.vocab.RegionOv

interface LocationSdo : StixDomainObject {
    val name: String
    val description: String?
    val latitude: Latitude?
    val longitude: Longitude?
    val precision: LatLongPrecision?
    val region: RegionOv?
    val administrativeArea: AdministrativeArea?
    val city: City?
    val streetAddress: StreetAddress?
    val postalCode: PostalCode?
}

data class Location(
    override val name: String,
    override val description: String? = null,
    override val latitude: Latitude? = null,
    override val longitude: Longitude? = null,
    override val precision: LatLongPrecision? = null,
    override val region: RegionOv? = null,
    override val administrativeArea: AdministrativeArea?,
    override val city: City? = null,
    override val streetAddress: StreetAddress? = null,
    override val postalCode: PostalCode? = null,
    override val type: StixType = stixType,
    override val id: StixIdentifier = StixIdentifier(type),
    override val createdByRef: String? = null,
    override val created: StixInstant = StixInstant(),
    override val externalReferences: ExternalReferences? = null,
    override val objectMarkingsRefs: String? = null,
    override val granularMarkings: String? = null,
    override val specVersion: StixSpecVersion = StixSpecVersion(),
    override val labels: StixLabels? = null,
    override val modified: StixInstant = StixInstant(created),
    override val revoked: StixBoolean = StixBoolean()
) :
    LocationSdo {

    companion object {
        val stixType = StixType("location")
    }

}