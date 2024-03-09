
import { NextApiRequest, NextApiResponse } from "next";
import { getIronSession } from "iron-session";
import {
  sessionOptions,
  sleep,
  defaultSession,
  SessionData,
} from "../pages-components/login-router/lib";

export default async function handler(
  req: NextApiRequest,
  res: NextApiResponse,
) {
  const session = await getIronSession<SessionData>(req, res, sessionOptions);

  // POST request handling (for session creation)
  if (req.method === "POST") {
    session.isLoggedIn = true;
    session.username = req.body.username ?? "No username";
    await session.save();

    await sleep(250);

    // Redirect after creating session
    res.status(303).redirect("/client");
    return;
  }

  // GET request handling
  if (req.method === "GET") {
    const action = req.query.action as string;

    // Handle logout
    if (action === "logout") {
      session.destroy();
      res.redirect("/pages");
      return;
    }

    // Handle session retrieval
    await sleep(250);

    if (session.isLoggedIn !== true) {
      res.status(200).json(defaultSession);
    } else {
      res.status(200).json(session);
    }
    return;
  }

  // If the method is not supported
  res.status(405).end(`Method ${req.method} Not Allowed`);
}