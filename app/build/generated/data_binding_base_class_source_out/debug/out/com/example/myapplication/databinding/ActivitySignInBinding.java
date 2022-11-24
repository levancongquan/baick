// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button buttonDangKy;

  @NonNull
  public final Button buttonDangNhap;

  @NonNull
  public final ImageView circleImageView;

  @NonNull
  public final EditText password;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final EditText usename;

  private ActivitySignInBinding(@NonNull RelativeLayout rootView, @NonNull Button buttonDangKy,
      @NonNull Button buttonDangNhap, @NonNull ImageView circleImageView,
      @NonNull EditText password, @NonNull TextView textView2, @NonNull TextView textView3,
      @NonNull EditText usename) {
    this.rootView = rootView;
    this.buttonDangKy = buttonDangKy;
    this.buttonDangNhap = buttonDangNhap;
    this.circleImageView = circleImageView;
    this.password = password;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.usename = usename;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDangKy;
      Button buttonDangKy = ViewBindings.findChildViewById(rootView, id);
      if (buttonDangKy == null) {
        break missingId;
      }

      id = R.id.buttonDangNhap;
      Button buttonDangNhap = ViewBindings.findChildViewById(rootView, id);
      if (buttonDangNhap == null) {
        break missingId;
      }

      id = R.id.circleImageView;
      ImageView circleImageView = ViewBindings.findChildViewById(rootView, id);
      if (circleImageView == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.usename;
      EditText usename = ViewBindings.findChildViewById(rootView, id);
      if (usename == null) {
        break missingId;
      }

      return new ActivitySignInBinding((RelativeLayout) rootView, buttonDangKy, buttonDangNhap,
          circleImageView, password, textView2, textView3, usename);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
