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

import org.everit.email.Email;

/**
 * Persistent store of emails.
 */
public interface EmailStore {

  /**
   * Reads email based on email store identifier.
   *
   * @param emailPersistentId
   *          the identifier of the email in the store.
   * @return the stored email. Return <code>null</code> if not found email.
   */
  Email read(long emailPersistentId);

  /**
   * Removes the email from the store.
   *
   * @param emailPersistentId
   *          the identifier of the email in the store.
   */
  void remove(long emailPersistentId);

  /**
   * Store email.
   *
   * @param email
   *          the {@link Email} object that will be stored. Cannot be <code>null</code>.
   * @return The identifier of the email in the store.
   *
   * @throws NullPointerException
   *           if email parameter is <code>null</code>.
   */
  long store(Email email);

}
