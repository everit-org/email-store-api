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
   * Deletes an email permanently.
   *
   * @param storedEmailId
   *          The identifier of the stored email that should be deleted.
   *
   * @throws NonExistentEmailException
   *           if stored email not exists.
   */
  void delete(long storedEmailId);

  /**
   * Reads email based on email store identifier.
   *
   * @param storedEmailId
   *          the identifier of stored email.
   * @return the stored email. Return <code>null</code> if not found email.
   */
  Email read(long storedEmailId);

  /**
   * Save email to store.
   *
   * @param email
   *          the {@link Email} object that will be store. Cannot be <code>null</code>!
   * @return the stored email identifier.
   *
   * @throws NullPointerException
   *           if email parameter is <code>null</code>.
   */
  long save(Email email);

}
