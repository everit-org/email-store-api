package org.everit.email.store.api;

import org.everit.email.Email;

/**
 * A store that can persist email.
 */
public interface EmailStore {

  /**
   * Deletes an email permanently.
   *
   * @param emailStoreId
   *          The identifier of the stored email that should be deleted.
   */
  void delete(long emailStoreId);

  /**
   * Reads email based on email store identifier.
   *
   * @param emailStoreId
   *          the identifier of stored email.
   * @return the stored email. Return <code>null</code> if not found email.
   */
  Email read(long emailStoreId);

  /**
   * Save email to store.
   *
   * @param email
   *          the {@link Email} object that will be store.
   * @return the stored email identifier.
   */
  long save(Email email);

}
