class inal implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 private com.kkkwan.billing.activity.QuickPayActivity a; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void run ( ) {
		 /* .locals 8 */
		 v0 = this.a;
		 com.kkkwan.billing.activity.QuickPayActivity .c ( v0 );
		 final String v1 = "###"; // const-string v1, "###"
		 (( java.lang.String ) v0 ).split ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
		 int v0 = 0; // const/4 v0, 0x0
		 /* move v6, v0 */
	 } // :goto_0
	 /* array-length v0, v7 */
	 /* if-ge v6, v0, :cond_0 */
	 /* new-instance v0, Lcom/kkkwan/billing/c/c/a; */
	 /* invoke-direct {v0}, Lcom/kkkwan/billing/c/c/a;-><init>()V */
	 v1 = this.a;
	 final String v2 = "prop_id"; // const-string v2, "prop_id"
	 final String v3 = "prop_id"; // const-string v3, "prop_id"
	 com.kkkwan.billing.e.b.a .a ( v1,v2,v3 );
	 /* aget-object v3, v7, v6 */
	 final String v1 = "6"; // const-string v1, "6"
	 v4 = this.a;
	 int v5 = 1; // const/4 v5, 0x1
	 /* invoke-virtual/range {v0 ..v5}, Lcom/kkkwan/billing/c/c/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Z)Lcom/kkkwan/billing/b/d; */
	 /* add-int/lit8 v0, v6, 0x1 */
	 /* move v6, v0 */
} // :cond_0
return;
} // .end method
