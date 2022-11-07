public class com.adknowledge.superrewards.ResourceDelegator {
	 /* .source "ResourceDelegator.java" */
	 /* # direct methods */
	 public com.adknowledge.superrewards.ResourceDelegator ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void delegateValues ( java.lang.Class p0, java.lang.Class p1 ) {
		 /* .locals 16 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/Class", */
		 /* "<*>;", */
		 /* "Ljava/lang/Class", */
		 /* "<*>;)V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 21 */
	 /* .local p0, "fromClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
	 /* .local p1, "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
	 /* invoke-virtual/range {p1 ..p1}, Ljava/lang/Class;->getClasses()[Ljava/lang/Class; */
	 /* .local v0, "arr$":[Ljava/lang/Class; */
	 /* array-length v8, v0 */
	 /* .local v8, "len$":I */
	 int v5 = 0; // const/4 v5, 0x0
	 /* .local v5, "i$":I */
	 /* move v7, v5 */
} // .end local v0 # "arr$":[Ljava/lang/Class;
} // .end local v5 # "i$":I
} // .end local v8 # "len$":I
/* .local v7, "i$":I */
} // :goto_0
/* if-ge v7, v8, :cond_3 */
/* aget-object v11, v0, v7 */
/* .line 22 */
/* .local v11, "toSubClass":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Object;>;" */
/* invoke-virtual/range {p0 ..p0}, Ljava/lang/Class;->getClasses()[Ljava/lang/Class; */
/* .local v1, "arr$":[Ljava/lang/Class; */
/* array-length v9, v1 */
/* .local v9, "len$":I */
int v5 = 0; // const/4 v5, 0x0
} // .end local v7 # "i$":I
/* .restart local v5 # "i$":I */
/* move v6, v5 */
} // .end local v1 # "arr$":[Ljava/lang/Class;
} // .end local v5 # "i$":I
} // .end local v9 # "len$":I
/* .local v6, "i$":I */
} // :goto_1
/* if-ge v6, v9, :cond_2 */
/* aget-object v3, v1, v6 */
/* .line 23 */
/* .local v3, "fromSubClass":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Object;>;" */
(( java.lang.Class ) v11 ).getSimpleName ( ); // invoke-virtual {v11}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.Class ) v3 ).getSimpleName ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
v14 = (( java.lang.String ) v14 ).equals ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v14 != null) { // if-eqz v14, :cond_1
/* .line 24 */
(( java.lang.Class ) v11 ).getDeclaredFields ( ); // invoke-virtual {v11}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
/* .line 25 */
/* .local v13, "toSubClassFields":[Ljava/lang/reflect/Field; */
/* move-object v2, v13 */
/* .local v2, "arr$":[Ljava/lang/reflect/Field; */
/* array-length v10, v2 */
/* .local v10, "len$":I */
int v5 = 0; // const/4 v5, 0x0
} // .end local v6 # "i$":I
/* .restart local v5 # "i$":I */
} // :goto_2
/* if-ge v5, v10, :cond_1 */
/* aget-object v12, v2, v5 */
/* .line 26 */
/* .local v12, "toSubClassField":Ljava/lang/reflect/Field; */
int v4 = 0; // const/4 v4, 0x0
/* .line 28 */
/* .local v4, "fromSubClassField":Ljava/lang/reflect/Field; */
try { // :try_start_0
(( java.lang.reflect.Field ) v12 ).getName ( ); // invoke-virtual {v12}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
(( java.lang.Class ) v3 ).getField ( v14 ); // invoke-virtual {v3, v14}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 34 */
} // :goto_3
if ( v4 != null) { // if-eqz v4, :cond_0
(( java.lang.reflect.Field ) v4 ).getType ( ); // invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
(( java.lang.reflect.Field ) v12 ).getType ( ); // invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
v14 = (( java.lang.Object ) v14 ).equals ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v14 != null) { // if-eqz v14, :cond_0
/* .line 36 */
try { // :try_start_1
(( java.lang.reflect.Field ) v4 ).get ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.reflect.Field ) v12 ).set ( v12, v14 ); // invoke-virtual {v12, v12, v14}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
/* :try_end_1 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 25 */
} // :cond_0
} // :goto_4
/* add-int/lit8 v5, v5, 0x1 */
/* .line 22 */
} // .end local v2 # "arr$":[Ljava/lang/reflect/Field;
} // .end local v4 # "fromSubClassField":Ljava/lang/reflect/Field;
} // .end local v5 # "i$":I
} // .end local v10 # "len$":I
} // .end local v12 # "toSubClassField":Ljava/lang/reflect/Field;
} // .end local v13 # "toSubClassFields":[Ljava/lang/reflect/Field;
} // :cond_1
/* add-int/lit8 v5, v6, 0x1 */
/* .restart local v5 # "i$":I */
/* move v6, v5 */
} // .end local v5 # "i$":I
/* .restart local v6 # "i$":I */
/* .line 21 */
} // .end local v3 # "fromSubClass":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Object;>;"
} // :cond_2
/* add-int/lit8 v5, v7, 0x1 */
} // .end local v6 # "i$":I
/* .restart local v5 # "i$":I */
/* move v7, v5 */
} // .end local v5 # "i$":I
/* .restart local v7 # "i$":I */
/* .line 50 */
} // .end local v11 # "toSubClass":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Object;>;"
} // :cond_3
return;
/* .line 39 */
} // .end local v7 # "i$":I
/* .restart local v2 # "arr$":[Ljava/lang/reflect/Field; */
/* .restart local v3 # "fromSubClass":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Object;>;" */
/* .restart local v4 # "fromSubClassField":Ljava/lang/reflect/Field; */
/* .restart local v5 # "i$":I */
/* .restart local v10 # "len$":I */
/* .restart local v11 # "toSubClass":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Object;>;" */
/* .restart local v12 # "toSubClassField":Ljava/lang/reflect/Field; */
/* .restart local v13 # "toSubClassFields":[Ljava/lang/reflect/Field; */
/* :catch_0 */
/* move-exception v14 */
/* .line 37 */
/* :catch_1 */
/* move-exception v14 */
/* .line 31 */
/* :catch_2 */
/* move-exception v14 */
/* .line 29 */
/* :catch_3 */
/* move-exception v14 */
} // .end method
