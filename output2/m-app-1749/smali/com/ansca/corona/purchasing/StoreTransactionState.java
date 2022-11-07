public class com.ansca.corona.purchasing.StoreTransactionState {
	 /* .source "StoreTransactionState.java" */
	 /* # static fields */
	 public static final com.ansca.corona.purchasing.StoreTransactionState CANCELED;
	 public static final com.ansca.corona.purchasing.StoreTransactionState FAILED;
	 public static final com.ansca.corona.purchasing.StoreTransactionState PURCHASED;
	 public static final com.ansca.corona.purchasing.StoreTransactionState PURCHASING;
	 public static final com.ansca.corona.purchasing.StoreTransactionState REFUNDED;
	 public static final com.ansca.corona.purchasing.StoreTransactionState RESTORED;
	 public static final com.ansca.corona.purchasing.StoreTransactionState UNDEFINED;
	 /* # instance fields */
	 private Integer fStateId;
	 /* # direct methods */
	 static com.ansca.corona.purchasing.StoreTransactionState ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 26 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionState; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionState;-><init>(I)V */
		 /* .line 29 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionState; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionState;-><init>(I)V */
		 /* .line 32 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionState; */
		 int v1 = 2; // const/4 v1, 0x2
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionState;-><init>(I)V */
		 /* .line 35 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionState; */
		 int v1 = 3; // const/4 v1, 0x3
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionState;-><init>(I)V */
		 /* .line 38 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionState; */
		 int v1 = 4; // const/4 v1, 0x4
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionState;-><init>(I)V */
		 /* .line 41 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionState; */
		 int v1 = 5; // const/4 v1, 0x5
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionState;-><init>(I)V */
		 /* .line 44 */
		 /* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionState; */
		 int v1 = 6; // const/4 v1, 0x6
		 /* invoke-direct {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionState;-><init>(I)V */
		 return;
	 } // .end method
	 private com.ansca.corona.purchasing.StoreTransactionState ( ) {
		 /* .locals 0 */
		 /* .param p1, "stateId" # I */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 22 */
		 /* iput p1, p0, Lcom/ansca/corona/purchasing/StoreTransactionState;->fStateId:I */
		 /* .line 23 */
		 return;
	 } // .end method
	 public static com.ansca.corona.purchasing.StoreTransactionState fromValue ( Integer p0 ) {
		 /* .locals 7 */
		 /* .param p0, "stateId" # I */
		 /* .prologue */
		 /* .line 63 */
		 try { // :try_start_0
			 /* const-class v5, Lcom/ansca/corona/purchasing/StoreTransactionState; */
			 (( java.lang.Class ) v5 ).getDeclaredFields ( ); // invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
			 /* .local v0, "arr$":[Ljava/lang/reflect/Field; */
			 /* array-length v3, v0 */
			 /* .local v3, "len$":I */
			 int v2 = 0; // const/4 v2, 0x0
			 /* .local v2, "i$":I */
		 } // :goto_0
		 /* if-ge v2, v3, :cond_1 */
		 /* aget-object v1, v0, v2 */
		 /* .line 64 */
		 /* .local v1, "field":Ljava/lang/reflect/Field; */
		 (( java.lang.reflect.Field ) v1 ).getType ( ); // invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
		 /* const-class v6, Lcom/ansca/corona/purchasing/StoreTransactionState; */
		 v5 = 		 (( java.lang.Object ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
		 if ( v5 != null) { // if-eqz v5, :cond_0
			 /* .line 65 */
			 int v5 = 0; // const/4 v5, 0x0
			 (( java.lang.reflect.Field ) v1 ).get ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v4, Lcom/ansca/corona/purchasing/StoreTransactionState; */
			 /* .line 66 */
			 /* .local v4, "state":Lcom/ansca/corona/purchasing/StoreTransactionState; */
			 (( com.ansca.corona.purchasing.StoreTransactionState ) v4 ).toValue ( ); // invoke-virtual {v4}, Lcom/ansca/corona/purchasing/StoreTransactionState;->toValue()I
			 /* :try_end_0 */
			 v5 = 			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* if-ne v5, p0, :cond_0 */
			 /* .line 75 */
		 } // .end local v0 # "arr$":[Ljava/lang/reflect/Field;
	 } // .end local v1 # "field":Ljava/lang/reflect/Field;
} // .end local v2 # "i$":I
} // .end local v3 # "len$":I
} // .end local v4 # "state":Lcom/ansca/corona/purchasing/StoreTransactionState;
} // :goto_1
/* .line 63 */
/* .restart local v0 # "arr$":[Ljava/lang/reflect/Field; */
/* .restart local v1 # "field":Ljava/lang/reflect/Field; */
/* .restart local v2 # "i$":I */
/* .restart local v3 # "len$":I */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* .line 72 */
} // .end local v0 # "arr$":[Ljava/lang/reflect/Field;
} // .end local v1 # "field":Ljava/lang/reflect/Field;
} // .end local v2 # "i$":I
} // .end local v3 # "len$":I
/* :catch_0 */
/* move-exception v5 */
/* .line 75 */
} // :cond_1
v4 = com.ansca.corona.purchasing.StoreTransactionState.UNDEFINED;
} // .end method
/* # virtual methods */
public Integer toValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 51 */
/* iget v0, p0, Lcom/ansca/corona/purchasing/StoreTransactionState;->fStateId:I */
} // .end method
