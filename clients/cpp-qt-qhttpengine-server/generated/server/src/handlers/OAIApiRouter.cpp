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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>


#include "OAIApiRouter.h"
#include "OAIDefaultApiRequest.h"


namespace OpenAPI {

OAIApiRouter::OAIApiRouter() {
    createApiHandlers();
}

OAIApiRouter::~OAIApiRouter(){

}

void OAIApiRouter::createApiHandlers() { 
    mOAIDefaultApiHandler = QSharedPointer<OAIDefaultApiHandler>::create();
}


void OAIApiRouter::setOAIDefaultApiHandler(QSharedPointer<OAIDefaultApiHandler> handler){
    mOAIDefaultApiHandler = handler;
}

void OAIApiRouter::setUpRoutes() {
    
    Routes.insert(QString("%1 %2").arg("GET").arg("/").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIDefaultApiRequest(socket, mOAIDefaultApiHandler);
            reqObj->rootGetRequest();
    });
}

void OAIApiRouter::processRequest(QHttpEngine::Socket *socket){
    if( handleRequest(socket) ){
        return;
    }
    if( handleRequestAndExtractPathParam(socket) ){
        return;
    }
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    if(socket->isOpen()){
        socket->writeHeaders();
        socket->close();
    }
}

bool OAIApiRouter::handleRequest(QHttpEngine::Socket *socket){
    auto reqPath = QString("%1 %2").arg(fromQHttpEngineMethod(socket->method())).arg(socket->path()).toLower();
    if ( Routes.contains(reqPath) ) {
        Routes.value(reqPath).operator()(socket);
        return true;
    }
    return false;
}

bool OAIApiRouter::handleRequestAndExtractPathParam(QHttpEngine::Socket *socket){
    auto reqPath = QString("%1 %2").arg(fromQHttpEngineMethod(socket->method())).arg(socket->path()).toLower();
    return false;
}

}
