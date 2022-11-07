public class com.ansca.corona.purchasing.StoreTransactionErrorType {
	 /* .source "StoreTransactionErrorType.java" */
	 /* # static fields */
	 public static final com.ansca.corona.purchasing.StoreTransactionErrorType CLIENT_INVALID;
	 public static final com.ansca.corona.purchasing.StoreTransactionErrorType NONE;
	 public static final com.ansca.corona.purchasing.StoreTransactionErrorType PAYMENT_CANCELED;
	 public static final com.ansca.corona.purchasing.StoreTransactionErrorType PAYMENT_INVALID;
	 public static final com.ansca.corona.purchasing.StoreTransactionErrorType PAYMENT_NOT_ALLOWED;
	 public static final com.ansca.corona.purchasing.StoreTransactionErrorType UNKNOWN;
	 /* # instance fields */
	 private Integer fNumericId;
	 /* # direct methods */
	 static com.ansca.corona.purchasing.StoreTransactionErrorType ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 27 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;-><init>(I)V */
		 /* .line 30 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;-><init>(I)V */
		 /* .line 33 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
		 int v1 = 2; // const/4 v1, 0x2
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;-><init>(I)V */
		 /* .line 36 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
		 int v1 = 3; // const/4 v1, 0x3
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;-><init>(I)V */
		 /* .line 39 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
		 int v1 = 4; // const/4 v1, 0x4
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;-><init>(I)V */
		 /* .line 42 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
		 int v1 = 5; // const/4 v1, 0x5
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;-><init>(I)V */
		 return;
	 } // .end method
	 private com.ansca.corona.purchasing.StoreTransactionErrorType ( ) {
		 /* .locals 0 */
		 /* .param p1, "errorTypeId" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 23 */
		 /* iput p1, p0, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;->fNumericId:I */
		 /* .line 24 */
		 return;
	 } // .end method
	 public static com.ansca.corona.purchasing.StoreTransactionErrorType fromValue ( Integer p0 ) {
		 /* .locals 7 */
		 /* .param p0, "errorTypeId" # I */
		 /* .prologue */
		 /* .line 62 */
		 try { // :try_start_0
			 /* const-class v5, Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
			 (( java.lang.Class ) v5 ).getDeclaredFields ( ); // invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
			 /* .local v0, "arr$":[Ljava/lang/reflect/Field; */
			 /* array-length v4, v0 */
			 /* .local v4, "len$":I */
			 int v3 = 0; // const/4 v3, 0x0
			 /* .local v3, "i$":I */
		 } // :goto_0
		 /* if-ge v3, v4, :cond_1 */
		 /* aget-object v2, v0, v3 */
		 /* .line 63 */
		 /* .local v2, "field":Ljava/lang/reflect/Field; */
		 (( java.lang.reflect.Field ) v2 ).getType ( ); // invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
		 /* const-class v6, Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
		 v5 = 		 (( java.lang.Object ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
		 if ( v5 != null) { // if-eqz v5, :cond_0
			 /* .line 64 */
			 int v5 = 0; // const/4 v5, 0x0
			 (( java.lang.reflect.Field ) v2 ).get ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
			 /* .line 65 */
			 /* .local v1, "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
			 (( com.ansca.corona.purchasing.StoreTransactionErrorType ) v1 ).toValue ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;->toValue()I
			 /* :try_end_0 */
			 v5 = 			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* if-ne v5, p0, :cond_0 */
			 /* .line 74 */
		 } // .end local v0 # "arr$":[Ljava/lang/reflect/Field;
	 } // .end local v1 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType;
} // .end local v2 # "field":Ljava/lang/reflect/Field;
} // .end local v3 # "i$":I
} // .end local v4 # "len$":I
} // :goto_1
/* .line 62 */
/* .restart local v0 # "arr$":[Ljava/lang/reflect/Field; */
/* .restart local v2 # "field":Ljava/lang/reflect/Field; */
/* .restart local v3 # "i$":I */
/* .restart local v4 # "len$":I */
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
/* .line 71 */
} // .end local v0 # "arr$":[Ljava/lang/reflect/Field;
} // .end local v2 # "field":Ljava/lang/reflect/Field;
} // .end local v3 # "i$":I
} // .end local v4 # "len$":I
/* :catch_0 */
/* move-exception v5 */
/* .line 74 */
} // :cond_1
v1 = com.ansca.corona.purchasing.StoreTransactionErrorType.UNKNOWN;
} // .end method
/* # virtual methods */
public Integer toValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 50 */
/* iget v0, p0, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;->fNumericId:I */
} // .end method
