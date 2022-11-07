class net.chobin.android.a.p {
	 /* # instance fields */
	 private final Integer a;
	 private final java.lang.String a;
	 private final net.chobin.android.a.d a;
	 private final net.chobin.android.a.o a;
	 private final net.chobin.android.a.t a;
	 private final java.lang.String b;
	 /* # direct methods */
	 net.chobin.android.a.p ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 net.chobin.android.a.q .a ( p1 );
		 this.a = p2;
		 this.a = p3;
		 this.a = p4;
		 /* iput p5, p0, Lnet/chobin/android/a/p;->a:I */
		 this.a = p6;
		 this.b = p7;
		 return;
	 } // .end method
	 private void a ( ) {
		 /* .locals 2 */
		 v0 = this.a;
		 /* const/16 v1, 0x231 */
		 return;
	 } // .end method
	 private void a ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 return;
	 } // .end method
	 private void a ( Integer p0, Object p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
		 } // :goto_0
		 return;
	 } // :cond_0
	 v0 = this.a;
} // .end method
/* # virtual methods */
public Integer a ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lnet/chobin/android/a/p;->a:I */
} // .end method
public java.lang.String a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
} // .end method
public net.chobin.android.a.o a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
} // .end method
public void a ( java.security.PublicKey p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
	 /* .locals 8 */
	 int v7 = 5; // const/4 v7, 0x5
	 int v6 = 3; // const/4 v6, 0x3
	 /* const/16 v5, 0x123 */
	 int v4 = 2; // const/4 v4, 0x2
	 int v3 = 1; // const/4 v3, 0x1
	 int v1 = 0; // const/4 v1, 0x0
	 int v0 = 0; // const/4 v0, 0x0
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* if-eq p2, v3, :cond_0 */
		 /* if-ne p2, v4, :cond_6 */
	 } // :cond_0
	 try { // :try_start_0
		 final String v0 = "SHA1withRSA"; // const-string v0, "SHA1withRSA"
		 java.security.Signature .getInstance ( v0 );
		 (( java.security.Signature ) v0 ).initVerify ( p1 ); // invoke-virtual {v0, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
		 (( java.lang.String ) p3 ).getBytes ( ); // invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B
		 (( java.security.Signature ) v0 ).update ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/Signature;->update([B)V
		 net.chobin.android.a.b .a ( p4 );
		 v0 = 		 (( java.security.Signature ) v0 ).verify ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/Signature;->verify([B)Z
		 /* if-nez v0, :cond_1 */
		 final String v0 = "LicenseValidator: Signature verification failed."; // const-string v0, "LicenseValidator: Signature verification failed."
		 net.chobin.android.a.q .a ( v0 );
		 /* invoke-direct {p0}, Lnet/chobin/android/a/p;->a()V */
		 /* :try_end_0 */
		 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/security/InvalidKeyException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/security/SignatureException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Lnet/chobin/android/a/c; {:try_start_0 ..:try_end_0} :catch_3 */
	 } // :goto_0
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* new-instance v1, Ljava/lang/RuntimeException; */
	 /* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw v1 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 /* invoke-direct {p0, v7}, Lnet/chobin/android/a/p;->a(I)V */
	 /* :catch_2 */
	 /* move-exception v0 */
	 /* new-instance v1, Ljava/lang/RuntimeException; */
	 /* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw v1 */
	 /* :catch_3 */
	 /* move-exception v0 */
	 final String v0 = "LicenseValidator: Could not Base64-decode signature."; // const-string v0, "LicenseValidator: Could not Base64-decode signature."
	 net.chobin.android.a.q .a ( v0 );
	 /* invoke-direct {p0}, Lnet/chobin/android/a/p;->a()V */
} // :cond_1
try { // :try_start_1
	 net.chobin.android.a.v .a ( p3 );
	 /* :try_end_1 */
	 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_1 ..:try_end_1} :catch_4 */
	 /* iget v1, v0, Lnet/chobin/android/a/v;->a:I */
	 /* if-eq v1, p2, :cond_2 */
	 final String v0 = "LicenseValidator: Response codes don\'t match."; // const-string v0, "LicenseValidator: Response codes don\'t match."
	 net.chobin.android.a.q .a ( v0 );
	 /* invoke-direct {p0}, Lnet/chobin/android/a/p;->a()V */
	 /* :catch_4 */
	 /* move-exception v0 */
	 final String v0 = "LicenseValidator: Could not parse response."; // const-string v0, "LicenseValidator: Could not parse response."
	 net.chobin.android.a.q .a ( v0 );
	 /* invoke-direct {p0}, Lnet/chobin/android/a/p;->a()V */
} // :cond_2
/* iget v1, v0, Lnet/chobin/android/a/v;->b:I */
/* iget v2, p0, Lnet/chobin/android/a/p;->a:I */
/* if-eq v1, v2, :cond_3 */
final String v0 = "LicenseValidator: Nonce doesn\'t match."; // const-string v0, "LicenseValidator: Nonce doesn\'t match."
net.chobin.android.a.q .a ( v0 );
/* invoke-direct {p0}, Lnet/chobin/android/a/p;->a()V */
} // :cond_3
v1 = this.a;
v2 = this.a;
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_4 */
final String v0 = "LicenseValidator: Package name doesn\'t match."; // const-string v0, "LicenseValidator: Package name doesn\'t match."
net.chobin.android.a.q .a ( v0 );
/* invoke-direct {p0}, Lnet/chobin/android/a/p;->a()V */
} // :cond_4
v1 = this.b;
v2 = this.b;
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_5 */
final String v0 = "LicenseValidator: Version codes don\'t match."; // const-string v0, "LicenseValidator: Version codes don\'t match."
net.chobin.android.a.q .a ( v0 );
/* invoke-direct {p0}, Lnet/chobin/android/a/p;->a()V */
} // :cond_5
v1 = this.c;
v2 = android.text.TextUtils .isEmpty ( v1 );
if ( v2 != null) { // if-eqz v2, :cond_6
final String v0 = "LicenseValidator: User identifier is empty."; // const-string v0, "LicenseValidator: User identifier is empty."
net.chobin.android.a.q .a ( v0 );
/* invoke-direct {p0}, Lnet/chobin/android/a/p;->a()V */
} // :cond_6
if ( p2 != null) { // if-eqz p2, :cond_7
/* if-ne p2, v4, :cond_8 */
} // :cond_7
v1 = v2 = this.a;
/* invoke-direct {p0, v1, v0}, Lnet/chobin/android/a/p;->a(ILnet/chobin/android/a/v;)V */
/* goto/16 :goto_0 */
} // :cond_8
/* if-ne p2, v3, :cond_9 */
/* const/16 v1, 0x231 */
/* invoke-direct {p0, v1, v0}, Lnet/chobin/android/a/p;->a(ILnet/chobin/android/a/v;)V */
/* goto/16 :goto_0 */
} // :cond_9
/* const/16 v1, 0x101 */
/* if-ne p2, v1, :cond_a */
final String v1 = "LicenseValidator: Error contacting licensing server."; // const-string v1, "LicenseValidator: Error contacting licensing server."
net.chobin.android.a.q .a ( v1 );
/* invoke-direct {p0, v5, v0}, Lnet/chobin/android/a/p;->a(ILnet/chobin/android/a/v;)V */
/* goto/16 :goto_0 */
} // :cond_a
int v1 = 4; // const/4 v1, 0x4
/* if-ne p2, v1, :cond_b */
final String v1 = "LicenseValidator: An error has occurred on the licensing server."; // const-string v1, "LicenseValidator: An error has occurred on the licensing server."
net.chobin.android.a.q .a ( v1 );
/* invoke-direct {p0, v5, v0}, Lnet/chobin/android/a/p;->a(ILnet/chobin/android/a/v;)V */
/* goto/16 :goto_0 */
} // :cond_b
/* if-ne p2, v7, :cond_c */
final String v1 = "LicenseValidator: Licensing server is refusing to talk to this device, over quota."; // const-string v1, "LicenseValidator: Licensing server is refusing to talk to this device, over quota."
net.chobin.android.a.q .a ( v1 );
/* invoke-direct {p0, v5, v0}, Lnet/chobin/android/a/p;->a(ILnet/chobin/android/a/v;)V */
/* goto/16 :goto_0 */
} // :cond_c
/* const/16 v0, 0x102 */
/* if-ne p2, v0, :cond_d */
/* invoke-direct {p0, v3}, Lnet/chobin/android/a/p;->a(I)V */
/* goto/16 :goto_0 */
} // :cond_d
/* const/16 v0, 0x103 */
/* if-ne p2, v0, :cond_e */
/* invoke-direct {p0, v4}, Lnet/chobin/android/a/p;->a(I)V */
/* goto/16 :goto_0 */
} // :cond_e
/* if-ne p2, v6, :cond_f */
/* invoke-direct {p0, v6}, Lnet/chobin/android/a/p;->a(I)V */
/* goto/16 :goto_0 */
} // :cond_f
final String v0 = "LicenseValidator: Unknown response code for license check."; // const-string v0, "LicenseValidator: Unknown response code for license check."
net.chobin.android.a.q .a ( v0 );
/* invoke-direct {p0}, Lnet/chobin/android/a/p;->a()V */
/* goto/16 :goto_0 */
} // .end method
