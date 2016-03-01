/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.email.store;

/**
 * Exception for email existent failures.
 */
public class NonExistentEmailException extends RuntimeException {

  /**
   * The generated serial version UID.
   */
  private static final long serialVersionUID = 1564979421222055252L;

  public NonExistentEmailException(final String details) {
    super(details);
  }
}
