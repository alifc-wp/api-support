package com.rebiekong.aliyun.fc.api.support

import java.util

class APIGatewayInput {
  private var path: String = _
  private var httpMethod: String = _
  private var headers: util.Map[String, String] = _
  private var queryParameters: util.Map[String, String] = _
  private var pathParameters: util.Map[String, String] = _
  private var body: String = _
  private var base64Encoded = false

  def getPath: String = path

  def setPath(path: String): Unit = {
    this.path = path
  }

  def getHttpMethod: String = httpMethod

  def setHttpMethod(httpMethod: String): Unit = {
    this.httpMethod = httpMethod
  }

  def getHeaders: util.Map[String, String] = headers

  def setHeaders(headers: util.Map[String, String]): Unit = {
    this.headers = headers
  }

  def getQueryParameters: util.Map[String, String] = queryParameters

  def setQueryParameters(queryParameters: util.Map[String, String]): Unit = {
    this.queryParameters = queryParameters
  }

  def getPathParameters: util.Map[String, String] = pathParameters

  def setPathParameters(pathParameters: util.Map[String, String]): Unit = {
    this.pathParameters = pathParameters
  }

  def getBody: String = {
    if (isBase64Encoded) {
      import sun.misc.BASE64Decoder
      val decoder = new BASE64Decoder
      val b = decoder.decodeBuffer(body)
      this.setBody(new String(b))
      this.setIsBase64Encoded(false)
    }
    body
  }

  def setBody(body: String): Unit = {
    this.body = body
  }

  def isBase64Encoded: Boolean = base64Encoded

  def setIsBase64Encoded(base64Encoded: Boolean): Unit = {
    this.base64Encoded = base64Encoded
  }
}
