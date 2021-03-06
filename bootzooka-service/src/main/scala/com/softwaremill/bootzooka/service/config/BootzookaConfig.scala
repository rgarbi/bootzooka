package com.softwaremill.bootzooka.service.config

import com.typesafe.config.Config

trait BootzookaConfig extends BaseConfig {
  def rootConfig: Config

  private lazy val bootzookaConfig = rootConfig.getConfig("bootzooka")

  lazy val bootzookaResetLinkPattern = getString("bootzooka.reset-link-pattern", "http://localhost:8080/#/password-reset?code=%s")
}
