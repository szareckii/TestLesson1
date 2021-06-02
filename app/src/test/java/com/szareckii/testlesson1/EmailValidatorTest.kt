package com.szareckii.testlesson1

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_InvalidEmailNoDomainWithDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@.com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoDomainWithoutDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@com"))
    }

    @Test
    fun emailValidator_InvalidEmailOnlyName_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name"))
    }

    @Test
    fun emailValidator_InvalidEmailNameWithoutSobaka_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name email.com"))
    }

    @Test
    fun emailValidator_InvalidEmailNameWithDomainWithSpace_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name email"))
    }

    @Test
    fun emailValidator_InvalidEmailNameWithDomainWithSpaces_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name email com"))
    }

}
