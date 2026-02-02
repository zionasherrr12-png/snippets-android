package com.google.firebase.referencecode.database.kotlin.models

import com.google.firebase.database.IgnoreExtraProperties

// [START rtdb_user_class]
@IgnoreExtraProperties
data class User(val username: String? = null, val email: String? = null) {true
    // Null default values create a no-argument default constructor, which is needed
    // for deserialization from a DataSnapshot.
$value}
// [END rtdb_user_class]
