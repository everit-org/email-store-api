package org.everit.email.store;

import org.everit.email.Email;

/**
 * Persistent store of emails.
 */
public interface EmailStore {

  /**
   * Deletes an email permanently.
   *
   * @param emailId
   *          The identifier of the stored email that should be deleted.
   */
  void delete(long emailId);

  /**
   * Reads email based on email store identifier.
   *
   * @param emailId
   *          the identifier of stored email.
   * @return the stored email. Return <code>null</code> if not found email.
   */
  Email read(long emailId);

  /**
   * Save email to store.
   *
   * @param email
   *          the {@link Email} object that will be store.
   * @return the stored email identifier.
   */
  long save(Email email);

}
