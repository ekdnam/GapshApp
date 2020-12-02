# WhatsAppClone

Video timestamp: https://www.youtube.com/watch?v=988UZFB0heA&t=9631s

## Changes done compared to the video
- Add SHA-1 and SHA-256 fingerprints to the project by running `gradlew signingReport` and selecting the specified fingerprints for the `debug` variant.
- add `implementation 'androidx.browser:browser:1.2.0'` to `build.gradle (module:app)`. It resolves reCAPTCHA errors.
