"use strict";
class DBEntity {
  /**
   * Creates an instance of DBEntity.
   * @author tony001
   * @date 2025-03-07 17:03:34
   * @param {number} index
   * @param {string} id
   * @param {string} caption
   * @param {string} username
   * @param {number} timestamp
   * @param {IData} data
   */
  constructor(index, id, caption, username, timestamp, data) {
    this.index = index;
    this.id = id;
    this.caption = caption;
    this.username = username;
    this.timestamp = timestamp;
    this.data = data;
  }
}

export { DBEntity };
