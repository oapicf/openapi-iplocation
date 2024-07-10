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

/*
 * OAI__get_400_response.h
 *
 * 
 */

#ifndef OAI__get_400_response_H
#define OAI__get_400_response_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAI__get_400_response : public OAIObject {
public:
    OAI__get_400_response();
    OAI__get_400_response(QString json);
    ~OAI__get_400_response() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

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

    QString response_code;
    bool m_response_code_isSet;
    bool m_response_code_isValid;

    QString response_message;
    bool m_response_message_isSet;
    bool m_response_message_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAI__get_400_response)

#endif // OAI__get_400_response_H
