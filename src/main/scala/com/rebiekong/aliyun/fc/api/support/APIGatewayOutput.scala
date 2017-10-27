package com.rebiekong.aliyun.fc.api.support

import java.util


/**
  * Created by rebie on 17-9-15.
  */
class APIGatewayOutput {
  private var base64Encoded = false
  private var statusCode = 200
  private var headers: util.Map[String, String] = new util.HashMap[String, String]
  private var body = ""

  def getStatusCode: Int = statusCode

  def setStatusCode(statusCode: Int): APIGatewayOutput = {
    this.statusCode = statusCode
    this
  }

  def getHeaders: util.Map[String, String] = headers

  def setHeaders(headers: util.Map[String, String]): APIGatewayOutput = {
    this.headers = headers
    this
  }

  def getBody: String = body

  def setBody(body: String): APIGatewayOutput = {
    this.body = body
    this
  }

  def isBase64Encoded: Boolean = {
    base64Encoded
  }

  def setBase64Encoded(base64Encoded: Boolean): Unit = {
    this.base64Encoded = base64Encoded
  }
}
