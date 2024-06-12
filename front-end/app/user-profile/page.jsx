export default function UserProfilePage() {
  return (
    <main>
      <div>
        <h1>
          <div class="flex items-center gap-2">
            <div class="text-2xl">
              <span class="hidden dark:inline">🌝</span>
              <span class="dark:hidden">🛠</span>
              <a
                class="text-indigo-500 dark:text-indigo-400 underline hover:no-underline"
                href="/"
              >
                iron-session
              </a>
              <span class="text-slate-700 dark:text-slate-300">
                examples: App router
              </span>
            </div>

            <span class="text-slate-300 dark:text-slate-700 text-xl"> | </span>
            <div>
              <div class="flex items-center gap-2 text-md">
                <a
                  href="https://github.com/vvo/iron-session"
                  target="_blank"
                  class="text-slate-700 dark:text-slate-300 underline hover:no-underline"
                >
                  vvo/iron-session
                </a>
              </div>
            </div>
          </div>
        </h1>
        <h2 class="text-lg text-slate-500 dark:text-slate-400">
          Protected Page
        </h2>
      </div>

      <div class="max-w-xl space-y-2">
        <p>
          Hello <strong>Alison!</strong>
        </p>
        <p>
          This page is protected and can only be accessed if you are logged in.
          Otherwise you will be redirected to the login page.
        </p>
        <p>The check is done via a fetch call on the client using SWR.</p>
        <p>
          One benefit of using
          <a
            href="https://swr.vercel.app"
            target="_blank"
            class="text-indigo-500 dark:text-indigo-400 underline hover:no-underline"
          >
            SWR
          </a>
          : if you open the page in different tabs/windows, and logout from one
          place, every other tab/window will be synced and logged out.
        </p>
      </div>
      <p>
        <a
          class="text-indigo-500 dark:text-indigo-400 underline hover:no-underline"
          href="/app-router-client-component-route-handler-swr"
        >
          ← Back
        </a>
      </p>
    </main>
  );
}
