package com.contactsbutler.base

import contacts.core.entities.Contact

/**
 * TODO Describe the interaction flow between a butler and the device owner.
 */
interface Butler {
    fun findAContactToGroom(): Contact?
    fun introduceMyself()
    fun explainWhyTheContactNeedsGrooming(contact: Contact)
    fun letTheOwnerGroomTheContact(contact: Contact)
    fun complementTheOwnerForGroomingTheContact(contact: Contact)
    fun sayGoodBye()
}