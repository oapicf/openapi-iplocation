/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAI__get_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAI__get_200_response::OAI__get_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAI__get_200_response::OAI__get_200_response() {
    this->initializeModel();
}

OAI__get_200_response::~OAI__get_200_response() {}

void OAI__get_200_response::initializeModel() {

    m_ip_isSet = false;
    m_ip_isValid = false;

    m_ip_number_isSet = false;
    m_ip_number_isValid = false;

    m_ip_version_isSet = false;
    m_ip_version_isValid = false;

    m_country_name_isSet = false;
    m_country_name_isValid = false;

    m_country_code2_isSet = false;
    m_country_code2_isValid = false;

    m_isp_isSet = false;
    m_isp_isValid = false;

    m_response_code_isSet = false;
    m_response_code_isValid = false;

    m_response_message_isSet = false;
    m_response_message_isValid = false;
}

void OAI__get_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAI__get_200_response::fromJsonObject(QJsonObject json) {

    m_ip_isValid = ::OpenAPI::fromJsonValue(ip, json[QString("ip")]);
    m_ip_isSet = !json[QString("ip")].isNull() && m_ip_isValid;

    m_ip_number_isValid = ::OpenAPI::fromJsonValue(ip_number, json[QString("ip_number")]);
    m_ip_number_isSet = !json[QString("ip_number")].isNull() && m_ip_number_isValid;

    m_ip_version_isValid = ::OpenAPI::fromJsonValue(ip_version, json[QString("ip_version")]);
    m_ip_version_isSet = !json[QString("ip_version")].isNull() && m_ip_version_isValid;

    m_country_name_isValid = ::OpenAPI::fromJsonValue(country_name, json[QString("country_name")]);
    m_country_name_isSet = !json[QString("country_name")].isNull() && m_country_name_isValid;

    m_country_code2_isValid = ::OpenAPI::fromJsonValue(country_code2, json[QString("country_code2")]);
    m_country_code2_isSet = !json[QString("country_code2")].isNull() && m_country_code2_isValid;

    m_isp_isValid = ::OpenAPI::fromJsonValue(isp, json[QString("isp")]);
    m_isp_isSet = !json[QString("isp")].isNull() && m_isp_isValid;

    m_response_code_isValid = ::OpenAPI::fromJsonValue(response_code, json[QString("response_code")]);
    m_response_code_isSet = !json[QString("response_code")].isNull() && m_response_code_isValid;

    m_response_message_isValid = ::OpenAPI::fromJsonValue(response_message, json[QString("response_message")]);
    m_response_message_isSet = !json[QString("response_message")].isNull() && m_response_message_isValid;
}

QString OAI__get_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAI__get_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_ip_isSet) {
        obj.insert(QString("ip"), ::OpenAPI::toJsonValue(ip));
    }
    if (m_ip_number_isSet) {
        obj.insert(QString("ip_number"), ::OpenAPI::toJsonValue(ip_number));
    }
    if (m_ip_version_isSet) {
        obj.insert(QString("ip_version"), ::OpenAPI::toJsonValue(ip_version));
    }
    if (m_country_name_isSet) {
        obj.insert(QString("country_name"), ::OpenAPI::toJsonValue(country_name));
    }
    if (m_country_code2_isSet) {
        obj.insert(QString("country_code2"), ::OpenAPI::toJsonValue(country_code2));
    }
    if (m_isp_isSet) {
        obj.insert(QString("isp"), ::OpenAPI::toJsonValue(isp));
    }
    if (m_response_code_isSet) {
        obj.insert(QString("response_code"), ::OpenAPI::toJsonValue(response_code));
    }
    if (m_response_message_isSet) {
        obj.insert(QString("response_message"), ::OpenAPI::toJsonValue(response_message));
    }
    return obj;
}

QString OAI__get_200_response::getIp() const {
    return ip;
}
void OAI__get_200_response::setIp(const QString &ip) {
    this->ip = ip;
    this->m_ip_isSet = true;
}

bool OAI__get_200_response::is_ip_Set() const{
    return m_ip_isSet;
}

bool OAI__get_200_response::is_ip_Valid() const{
    return m_ip_isValid;
}

QString OAI__get_200_response::getIpNumber() const {
    return ip_number;
}
void OAI__get_200_response::setIpNumber(const QString &ip_number) {
    this->ip_number = ip_number;
    this->m_ip_number_isSet = true;
}

bool OAI__get_200_response::is_ip_number_Set() const{
    return m_ip_number_isSet;
}

bool OAI__get_200_response::is_ip_number_Valid() const{
    return m_ip_number_isValid;
}

qint32 OAI__get_200_response::getIpVersion() const {
    return ip_version;
}
void OAI__get_200_response::setIpVersion(const qint32 &ip_version) {
    this->ip_version = ip_version;
    this->m_ip_version_isSet = true;
}

bool OAI__get_200_response::is_ip_version_Set() const{
    return m_ip_version_isSet;
}

bool OAI__get_200_response::is_ip_version_Valid() const{
    return m_ip_version_isValid;
}

QString OAI__get_200_response::getCountryName() const {
    return country_name;
}
void OAI__get_200_response::setCountryName(const QString &country_name) {
    this->country_name = country_name;
    this->m_country_name_isSet = true;
}

bool OAI__get_200_response::is_country_name_Set() const{
    return m_country_name_isSet;
}

bool OAI__get_200_response::is_country_name_Valid() const{
    return m_country_name_isValid;
}

QString OAI__get_200_response::getCountryCode2() const {
    return country_code2;
}
void OAI__get_200_response::setCountryCode2(const QString &country_code2) {
    this->country_code2 = country_code2;
    this->m_country_code2_isSet = true;
}

bool OAI__get_200_response::is_country_code2_Set() const{
    return m_country_code2_isSet;
}

bool OAI__get_200_response::is_country_code2_Valid() const{
    return m_country_code2_isValid;
}

QString OAI__get_200_response::getIsp() const {
    return isp;
}
void OAI__get_200_response::setIsp(const QString &isp) {
    this->isp = isp;
    this->m_isp_isSet = true;
}

bool OAI__get_200_response::is_isp_Set() const{
    return m_isp_isSet;
}

bool OAI__get_200_response::is_isp_Valid() const{
    return m_isp_isValid;
}

QString OAI__get_200_response::getResponseCode() const {
    return response_code;
}
void OAI__get_200_response::setResponseCode(const QString &response_code) {
    this->response_code = response_code;
    this->m_response_code_isSet = true;
}

bool OAI__get_200_response::is_response_code_Set() const{
    return m_response_code_isSet;
}

bool OAI__get_200_response::is_response_code_Valid() const{
    return m_response_code_isValid;
}

QString OAI__get_200_response::getResponseMessage() const {
    return response_message;
}
void OAI__get_200_response::setResponseMessage(const QString &response_message) {
    this->response_message = response_message;
    this->m_response_message_isSet = true;
}

bool OAI__get_200_response::is_response_message_Set() const{
    return m_response_message_isSet;
}

bool OAI__get_200_response::is_response_message_Valid() const{
    return m_response_message_isValid;
}

bool OAI__get_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_ip_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ip_number_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ip_version_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_country_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_country_code2_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_isp_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_response_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_response_message_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAI__get_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
