/**
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAI__get_200_response.h
 *
 * 
 */

#ifndef OAI__get_200_response_H
#define OAI__get_200_response_H

#include <QJsonObject>

#include "OAIInt64.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAI__get_200_response : public OAIObject {
public:
    OAI__get_200_response();
    OAI__get_200_response(QString json);
    ~OAI__get_200_response() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getIp() const;
    void setIp(const QString &ip);
    bool is_ip_Set() const;
    bool is_ip_Valid() const;

    OAIInt64 getIpNumber() const;
    void setIpNumber(const OAIInt64 &ip_number);
    bool is_ip_number_Set() const;
    bool is_ip_number_Valid() const;

    qint32 getIpVersion() const;
    void setIpVersion(const qint32 &ip_version);
    bool is_ip_version_Set() const;
    bool is_ip_version_Valid() const;

    QString getCountryName() const;
    void setCountryName(const QString &country_name);
    bool is_country_name_Set() const;
    bool is_country_name_Valid() const;

    QString getCountryCode2() const;
    void setCountryCode2(const QString &country_code2);
    bool is_country_code2_Set() const;
    bool is_country_code2_Valid() const;

    QString getIsp() const;
    void setIsp(const QString &isp);
    bool is_isp_Set() const;
    bool is_isp_Valid() const;

    QString getResponseCode() const;
    void setResponseCode(const QString &response_code);
    bool is_response_code_Set() const;
    bool is_response_code_Valid() const;

    QString getResponseMessage() const;
    void setResponseMessage(const QString &response_message);
    bool is_response_message_Set() const;
    bool is_response_message_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString ip;
    bool m_ip_isSet;
    bool m_ip_isValid;

    OAIInt64 ip_number;
    bool m_ip_number_isSet;
    bool m_ip_number_isValid;

    qint32 ip_version;
    bool m_ip_version_isSet;
    bool m_ip_version_isValid;

    QString country_name;
    bool m_country_name_isSet;
    bool m_country_name_isValid;

    QString country_code2;
    bool m_country_code2_isSet;
    bool m_country_code2_isValid;

    QString isp;
    bool m_isp_isSet;
    bool m_isp_isValid;

    QString response_code;
    bool m_response_code_isSet;
    bool m_response_code_isValid;

    QString response_message;
    bool m_response_message_isSet;
    bool m_response_message_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAI__get_200_response)

#endif // OAI__get_200_response_H